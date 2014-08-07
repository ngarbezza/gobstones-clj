(ns gobstones.parser-spec
  (:require [gobstones.parser   :refer [parse]]
            [gobstones.commands :as cmds]
            [speclj.core        :refer [describe it should=]]))

(describe "gobstones parser"

  (describe "basic commands"

    (it "parses a Skip command"
      (should= (parse "Skip") (cmds/skip)))))
