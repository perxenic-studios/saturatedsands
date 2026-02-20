package dev.perxenic.saturatedsands.infra;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public enum DyeOrdering {
    DEFAULT_SPECTRUM(ImmutableList.of(
            "white",
            "light_gray",
            "gray",
            "black",
            "brown",
            "maroon",
            "rose",
            "red",
            "coral",
            "ginger",
            "orange",
            "tan",
            "beige",
            "yellow",
            "olive",
            "amber",
            "lime",
            "forest",
            "green",
            "verdant",
            "teal",
            "cyan",
            "aqua",
            "mint",
            "light_blue",
            "blue",
            "navy",
            "slate",
            "indigo",
            "purple",
            "magenta",
            "pink"
    )),
    MOD_SEPARATED_SPECTRUM(ImmutableList.of(
            "white",
            "light_gray",
            "gray",
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "lime",
            "green",
            "cyan",
            "light_blue",
            "blue",
            "purple",
            "magenta",
            "pink",
            "maroon",
            "rose",
            "coral",
            "ginger",
            "tan",
            "beige",
            "olive",
            "amber",
            "forest",
            "verdant",
            "teal",
            "aqua",
            "mint",
            "navy",
            "slate",
            "indigo"
    )),
    ALPHABETICAL(new ArrayList<>()); // Generated automatically by the terracotta database

    public final ArrayList<String> orderingList;

    DyeOrdering(List<String> orderingList) {
        this.orderingList = new ArrayList<>(orderingList);
    }
}
