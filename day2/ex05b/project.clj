(defproject ws-ldn-11-ex05b "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.9.0-alpha8"]
                 [thi.ng/geom "0.0.1178-SNAPSHOT"]
                 [reagent "0.5.1"]]

  :profiles {:dev {:dependencies [[thheller/shadow-devtools "0.1.42"]
                                  [thheller/shadow-build "1.0.212"]
                                  [org.clojure/clojurescript "1.9.93"]
                                  [org.clojure/core.async "0.2.385"]]}})
