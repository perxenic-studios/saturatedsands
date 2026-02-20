package dev.perxenic.saturatedsands.infra;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public enum PatternOrdering {
    GLAZED_ORDERING(ImmutableList.of(
            "sun",
            "modern",
            "cross",
            "crawl",
            "target",
            "ring",
            "petal",
            "potion",
            "heart",
            "bird",
            "fish",
            "knot",
            "frame",
            "flower",
            "murk",
            "whorl",
            "spoke",
            "melon",
            "plant",
            "torus",
            "echo",
            "creep",
            "bubble",
            "belt",
            "geo",
            "fan",
            "arc",
            "tile",
            "fringe",
            "blade",
            "arrow",
            "leaf"
    )),
    MOD_SEPARATED_GLAZED(ImmutableList.of(
            "sun",
            "modern",
            "cross",
            "crawl",
            "target",
            "potion",
            "fish",
            "flower",
            "spoke",
            "plant",
            "creep",
            "geo",
            "fan",
            "blade",
            "arrow",
            "leaf",
            "ring",
            "petal",
            "heart",
            "bird",
            "knot",
            "frame",
            "murk",
            "whorl",
            "melon",
            "torus",
            "echo",
            "bubble",
            "belt",
            "arc",
            "tile",
            "fringe"
    )),
    ALPHABETICAL(new ArrayList<>()); // Generated automatically by the terracotta database

    public final ArrayList<String> orderingList;

    PatternOrdering(List<String> orderingList) {
        this.orderingList = new ArrayList<>(orderingList);
    }
}
