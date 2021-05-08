cmake_minimum_required(VERSION 3.17)
project(JNI_Demo_Lib)

set(CMAKE_CXX_STANDARD 14)


include_directories(${PROJECT_SOURCE_DIR}/include)
include_directories(${PROJECT_SOURCE_DIR}/include/darwin)

add_subdirectory(Demo1)
add_subdirectory(Demo2)

add_subdirectory(dynamic_register)

add_subdirectory(thread)

add_subdirectory(calljava)

add_library(register SHARED library.cpp library.h )