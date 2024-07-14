(defproject lein-monorepo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :repl-options {:init-ns lein-monorepo.core}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :profiles {:time {:dependencies [[clj-time "0.15.2"]]
                    :main lein-monorepo.time
                    :aot [lein-monorepo.time]
                    :uberjar-name "ubertime.jar"}
             :json {:dependencies [[cheshire "5.13.0"]]
                    :main lein-monorepo.json
                    :aot [lein-monorepo.json]
                    :uberjar-name "uberjson.jar"}})
