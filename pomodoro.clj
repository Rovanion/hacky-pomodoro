#!/usr/bin/env bb

(let [now                  (java.time.ZonedDateTime/now)
      minutes              (.getMinute now)
      minutes-from-quarter (mod minutes 15)]
  (println minutes-from-quarter)
  (when (= minutes-from-quarter 0)
    (println (shell/sh "notify-send" "Time out little man!"))
    (println (shell/sh "physlock"))))
