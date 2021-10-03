(ns load-file-test
  (:require [nbb.core :refer [load-file *file*]]))

(.then (load-file "test-scripts/loaded_by_load_file_test.cljs")
       (fn [m]
         (assoc (.-val m) :load-file-test-file-dyn-var *file*)))


