;; gorilla-repl.fileformat = 1

;; **
;;; # MxNet Quick Start Page
;;; 
;; **

;; @@
(ns happy-tomato
    (:require [org.apache.clojure-mxnet.context :as context]
            [org.apache.clojure-mxnet.executor :as executor]
            [org.apache.clojure-mxnet.lr-scheduler :as lr-scheduler]
            [org.apache.clojure-mxnet.ndarray :as ndarray]
            [org.apache.clojure-mxnet.optimizer :as opt]
            [org.apache.clojure-mxnet.random :as random]
            [org.apache.clojure-mxnet.shape :as mx-shape]
            [org.apache.clojure-mxnet.symbol :as sym]
            [clojure.java.io :as io]
            [clojure.java.shell :refer [sh]]
            [opencv4.core :as cv]
            [opencv4.utils :as cvu]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=
