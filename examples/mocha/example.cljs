(ns example
  (:require ["assert" :as assert]
            ["mocha" :as mocha :refer [describe it]]))

(describe
 "Array"
 (fn [] (assert/equals 1 2))
 #_(fn []
   (describe
    "#indexOf"
    (fn []
      (it "should return -1 when the value is not present"
             (fn []
               (assert/equal (.indexOf #js [1 2 3] 4) -1)))))))


