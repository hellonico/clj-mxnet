;; gorilla-repl.fileformat = 1

;; **
;;; # MxNet Practice Page
;;; 
;; **

;; @@
(ns dry-sunrise
  (:require [org.apache.clojure-mxnet.ndarray :as ndarray]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(let [ arr (ndarray/ones [3 3])]
 (ndarray/shape-vec arr))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"},{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"}],"value":"[3 3]"}
;; <=

;; @@

;; @@
