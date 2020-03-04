#!/bin/bash

docker run -it --mount source="secret",target=/sec alpine
