(ns lein-monorepo.time
  (:require [clj-time.core :as t])
  (:gen-class))

(defn -main []
  (println "Date")
  (println (.toString (t/now))))
