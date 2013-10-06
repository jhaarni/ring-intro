(ns ring-intro.server
  (:require [noir.server :as server]
            [ring-intro.web])
  (:gen-class))

(defn -main [& m]
  (server/start 9090 {:mode :dev}))
