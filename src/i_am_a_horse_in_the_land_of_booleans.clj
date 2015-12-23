(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ":(")

(defn abs [x]
  (if (< x 0) (* -1 x) x)
)

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    (divides? 15 n) "gotcha!"
    :else           ""
    )
)

(defn teen? [age] 
  (if (and (> age 12) (< age 20))
    true false)
)

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
  ":(")

; '_______'
