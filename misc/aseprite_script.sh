# A script that uses asesprite to automatically generate textures

# Arguments:
# $1 - Aseprite executable path

# Loop through every pattern in directory specified by positional argument 2
find './pattern' | while read pattern; do
    # Check if pattern is a file
    if ! [ -f "$pattern" ]; then
        continue
    fi

    # Loop through every palette in directory specified by positional argument 3
    find './palette' | while read palette; do
        # Check if palette is a file
        if ! [ -f "$palette" ]; then
            continue
        fi

        # Open file with aseprite, apply palette and then save it into the output directory
        $1 -b "$pattern" --color-mode indexed --palette "$palette" --save-as "generated_tex/$(basename $pattern .png)/$(basename $palette .png).png"
    done
done
