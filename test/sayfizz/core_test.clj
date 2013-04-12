(ns sayfizz.core-test
  (:use clojure.test
        sayfizz.core))

(deftest fizzbuzz-test
  (is (= [1 2 "Fizz"
          4 "Buzz" "Fizz"
          7 8 "Fizz"
          "Buzz" 11 "Fizz"
          13 14 "FizzBuzz"]
         (take 15 (fizzbuzzify (rest (range)))))))
