(native-header "QApplication"
               "QPushButton")

(defn qt-app []
  "int argc = runtime::count(_star_command_line_args_star_);
   char** argv = new char*[argc];

   for(int i = 0; i < argc; ++i) {
      var v = runtime::nth(_star_command_line_args_star_,i);
      argv[i] = new char[runtime::count(v)];
      std::strcpy(argv[i], string::to<std::string>(v).c_str());
   }

   __result = obj<pointer>(new QApplication(argc, argv));")

(defn qt-button [str]
  "QPushButton *button = new QPushButton(string::to<std::string>(str).c_str());
   button->resize(100,30);
   button->show();
   __result = obj<pointer>(button);")

(defn qt-exec [a b]
  "pointer::to_pointer<QApplication>(a)->exec();")

(def app (qt-app))
(def button (qt-button "Hello World!!"))

(qt-exec app button)
