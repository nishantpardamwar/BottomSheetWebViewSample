This is a Sample App to demonstrate the implementation of WebView inside a BottomSheet.

# Problem with WebView inside a BottomSheet

The main reason to use BottomSheet for anyone is to have that Gesture for collapsing or exapnding a View but as soon you insert
a WebView in your BottomSheet's view you will notice that BottomSheet Getures are not playing well with webview content scrolling.

# Solution

So the idea solution for the above problem would be to be able to scroll webview content until they reached top of the page and
further scroll down will collapse the BottomSheet.

# Setup

- You will require Android Studio 3.0 (or newer).
- Git Clone project.
- Build app and enjoy :)

# LICENSE

    MIT License

    Copyright (c) 2020 Nishant Pardamwar

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
