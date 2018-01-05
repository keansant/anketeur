# closurvey

Closurvey is a small, flexible web app for conducting surveys.

## Status

Work In Progress -- literally born yesterday, not ready for use

## Goals

* The goal is to provide a simple yet flexible, self-contained web app for conducting surveys.
* Data should be in a readily accessible format, e.g. json, edn, csv

## Non-goals

* This app does not include user management and does not collect user identification. Data ownership is managed entirely by pass-phrases. Unless customized to integrate with authentication systems, pass-phrases can only be reset manually.

* This app does not collect or send emails. It is up to the survey organizer to provide the link to the respondents.

## Prerequisites

### Production
This requires java 8.

### Development
You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein run 

## License
EPL, same as clojure.

This project is uses template code generated by Luminus web, and all generated code is under respective licenses (Luminus web is copyright © 2015 Dmitri Sotnikov)
Code that has been added and isn't part of the original template (mainly views, client and controller) is copyright © 2018 Kean Santos
