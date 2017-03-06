CONFIG += c++11
QMAKE_CXXFLAGS += -std=c++11

QT += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = QTTest
TEMPLATE = app

SOURCES += core.cpp
