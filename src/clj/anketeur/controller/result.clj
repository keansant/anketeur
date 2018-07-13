(ns anketeur.controller.result
  (:require
    [clojure.tools.logging :as log]
    [anketeur.layout :as layout]
    [anketeur.model :as model]
    [anketeur.survey :as survey]
    [anketeur.util.core :as util]
    [anketeur.view.result :as view.result]
    [ring.util.http-response :as response]))

(defn render-opener [survey-table]
  (let [doclist (survey/query-docs survey-table (complement :deleted?))
        errors (when (empty? doclist)
                  ["No documents found. Please create a new document."])]
    (layout/render-hiccup
      view.result/opener
      {:glossary {:title "Survey Results"}
       :flash-errors errors
       :open-link-base "/result/id/"
       :doclist doclist})))

(defn read-aggregate-result [survey-table answer-table surveyno]
  (let [survey-info (survey/read-doc survey-table surveyno)
        answers (survey/read-answers answer-table surveyno)]
     (model/survey-result-agg survey-info answers)))

(defn render-result [survey-table answer-table surveyno]
  (let [result-agg (read-aggregate-result survey-table answer-table surveyno)]
    (log/info "surveyno: " surveyno "result-agg" result-agg)
    (layout/render-hiccup
      view.result/result-page
      (merge
        result-agg
        {:export-link-base "/result/export/"
         :glossary {:title "Survey Results"}}))))

(defn export [survey-table answer-table format surveyno]
  (let [result-agg (read-aggregate-result survey-table answer-table surveyno)
        text (util/export-format format result-agg)]
    (layout/render-text text)))
