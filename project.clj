(defproject AncapMarkov "0.0.f*ckit"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [twitter-api "0.7.8"]
                 [environ "1.0.0"]
                 [org.slf4j/slf4j-log4j12 "1.7.12"]
                 [clj-http "2.0.1"]
                 [overtone/at-at "1.2.0"]]
  :main AncapMarkov.core
  :aot [AncapMarkov.core]
  :plugins [[lein-environ "1.0.0"]])
