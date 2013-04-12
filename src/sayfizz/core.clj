(ns sayfizz.core)

(defn divisible-by [num base]
  (zero? (mod num base)))

(defn replace-num [base repl]
  (fn [n]
    (when (divisible-by n base) repl)))

(def fizz (replace-num 3 "Fizz"))

(def buzz (replace-num 5 "Buzz"))

(defn fizzbuzz [x]
  (let [merge (str (fizz x) (buzz x))]
    (if (empty? merge)
      x
      merge)))

(defn fizzbuzzify [numbers]
  (map fizzbuzz numbers))
