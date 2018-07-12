# anketeur

> anketeur, Haitian for 'someone asking questions.'

Anketeur is a small, flexible web app for conducting surveys.

## Status

Prototype available (stage 1 on the roadmap below).
A demo is accessible online at: http://anketeur.herokuapp.com/ (runs on a limited dyno which may take a while to spin up)

## Roadmap

### 1. Working prototype

The first step is to have a working prototype, with functionality to create and edit surveys, fill them out, and gather results.

### 2. Decoupled Library

The survey component should be decoupled from the web application into a library. The code for the demo project will be moved into a separate "examples" directory.

### 3. Defined data model

The data model will have an explicit specification. While the model has always been open and portable between json and edn, this step would ensure consistency of data keys and format.

### 4. UI Efficiency and Consistency

Work out and use UI components to improve efficiency, and polish up the UI to make it consistent.

## Goals

* The goal is to provide a simple yet flexible, self-contained web app for conducting surveys.
* Data should be in a readily accessible format, e.g. json, edn

## Non-goals

* This app keeps user management minimal. Unless customized to integrate with authentication systems, pass-phrases can only be reset manually.

* This app does not send emails. It is up to the survey organizer to provide the link to the respondents.

## Prerequisites

### Production
This requires java 8.

### Development
You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

### Development

To start a web server for the application, run:

    lein run 

### Production

Create an uberjar with

    lein uberjar

Then run it with

    java -jar anketeur.jar

## Acknowledgments

These are the main things used in the project, but I'm sure they're just the tip of the iceberg
* Clojure, Clojurescript, Ring, Reagent, Hiccup, Luminusweb as the main things used in the project, but I'm sure that's just the tip of the iceberg
* Bootstrap and publicicons.org for the ux

## License
This project is uses template code generated by Luminus web, and all generated code is under respective licenses (Luminus web is copyright © 2015 Dmitri Sotnikov)

Code that has been added and isn't part of the original template (mainly model, views, client and controller) is under the MIT license.
