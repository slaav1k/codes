QT += core
QT -= gui

TARGET = a
CONFIG += console
CONFIG -= app_bundle

TEMPLATE = app

SOURCES += main.cpp

# Указание на использование стандарта C++20
QMAKE_CXXFLAGS += -std=c++11
