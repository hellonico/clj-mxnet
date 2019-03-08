(let [properties (select-keys (into {} (System/getProperties))
                              ["os.name"])
      platform (apply format "%s" (vals properties))
      
      ; https://stackoverflow.com/questions/4688336/what-is-an-elegant-way-to-set-up-a-leiningen-project-that-requires-different-dep
      mxnet (case platform
      "Mac OS X" '[org.apache.mxnet.contrib.clojure/clojure-mxnet-osx-cpu "1.4.0"]
      '[org.apache.mxnet.contrib.clojure/clojure-mxnet-linux-cpu "1.4.0"]
      )
      ; _ (println (str platform mxnet))
      ]

(defproject hello "0.1-SNAPSHOT"
:plugins [[hellonico/lein-gorilla "0.4.2"][lein-auto "0.1.3"]]
:auto {:default {:file-pattern #"\.(clj)$"}}
:main tutorial.introduction
:repositories [
; ["mxnet" {:url "https://repository.apache.org/content/repositories/staging/"}]
["vendredi" {:url "https://repository.hellonico.info/repository/hellonico/" :creds :gpg}]
]
:aliases {"notebook" ["gorilla" ":ip" "0.0.0.0" ":port" "10000"]}
:profiles {:dev {
  :dependencies [
;   ; use to start a gorilla repl
  [hellonico/gorilla-repl "0.4.1"]
]
  }}
:dependencies [
 [org.clojure/clojure "1.10.0"]
 [origami "4.0.0-3"]
 ~mxnet
 ]))
