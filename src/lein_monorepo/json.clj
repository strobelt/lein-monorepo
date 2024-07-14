(ns lein-monorepo.json
  (:require [cheshire.core :as j])
  (:gen-class))

(defn -main []
  (println "Json")
  (println (j/generate-string {:foo "bar"})))
