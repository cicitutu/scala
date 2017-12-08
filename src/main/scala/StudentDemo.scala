import student.Student
object StudentDemo {
  def main (args: Array[String]) {
    val s0 = new Student(name = "屠夫阿圈", sex = "男", Chinese = 77, Mathematics = 94, English = 65, TheClass = 1)
    val s1 = new Student(name = "胖头鱼", sex = "男", Chinese = 90, Mathematics = 100, English = 85, TheClass = 1)
    val s2 = new Student(name = "大雕", sex = "男", Chinese = 89, Mathematics = 62, English = 100, TheClass = 1)
    val s3 = new Student(name = "冷冷", sex = "女", Chinese = 60, Mathematics = 90, English = 95, TheClass = 1)
    val s4 = new Student(name = "奶子D", sex = "男", Chinese = 88, Mathematics = 86, English = 90, TheClass = 1)
    val s5 = new Student(name = "八老板", sex = "男", Chinese = 87, Mathematics = 87, English = 88, TheClass = 1)
    val s6 = new Student(name = "矮子龙", sex = "男", Chinese = 86, Mathematics = 77, English = 83, TheClass = 1)
    val s7 = new Student(name = "胖头妹", sex = "女", Chinese = 85, Mathematics = 68, English = 77, TheClass = 1)
    val s8 = new Student(name = "鸽妈", sex = "女", Chinese = 65, Mathematics = 79, English = 90, TheClass = 1)
    val s9 = new Student(name = "斗帝", sex = "男", Chinese = 68, Mathematics = 89, English = 67, TheClass = 1)

    val b0 = new Student(name = "小红", sex = "男", Chinese = 81, Mathematics = 94, English = 65, TheClass = 2)
    val b1 = new Student(name = "小黄", sex = "女", Chinese = 82, Mathematics = 100, English = 85, TheClass = 2)
    val b2 = new Student(name = "小蓝", sex = "男", Chinese = 87, Mathematics = 50, English = 100, TheClass = 2)
    val b3 = new Student(name = "小绿", sex = "女", Chinese = 94, Mathematics = 90, English = 70, TheClass = 2)
    val b4 = new Student(name = "小灰", sex = "男", Chinese = 95, Mathematics = 86, English = 90, TheClass = 2)
    val b5 = new Student(name = "小紫", sex = "男", Chinese = 100, Mathematics = 87, English = 88, TheClass = 2)
    val b6 = new Student(name = "小称", sex = "男", Chinese = 78, Mathematics = 77, English = 83, TheClass = 2)
    val b7 = new Student(name = "小青", sex = "女", Chinese = 70, Mathematics = 40, English = 77, TheClass = 2)
    val b8 = new Student(name = "小花", sex = "女", Chinese = 86, Mathematics = 79, English = 69, TheClass = 2)
    val b9 = new Student(name = "小强", sex = "男", Chinese = 77, Mathematics = 30, English = 67, TheClass = 2)


    val c0 = new Student(name = "大红", sex = "女", Chinese = 63, Mathematics = 55, English = 80, TheClass = 3)
    val c1 = new Student(name = "大黄", sex = "女", Chinese = 62, Mathematics = 56, English = 70, TheClass = 3)
    val c2 = new Student(name = "大蓝", sex = "男", Chinese = 61, Mathematics = 57, English = 100, TheClass = 3)
    val c3 = new Student(name = "大绿", sex = "女", Chinese = 55, Mathematics = 58, English = 60, TheClass = 3)
    val c4 = new Student(name = "大灰", sex = "男", Chinese = 53, Mathematics = 59, English = 55, TheClass = 3)
    val c5 = new Student(name = "大紫", sex = "男", Chinese = 51, Mathematics = 60, English = 58, TheClass = 3)
    val c6 = new Student(name = "大称", sex = "男", Chinese = 68, Mathematics = 61, English = 55, TheClass = 3)
    val c7 = new Student(name = "大青", sex = "女", Chinese = 69, Mathematics = 65, English = 57, TheClass = 3)
    val c8 = new Student(name = "大花", sex = "女", Chinese = 70, Mathematics = 40, English = 56, TheClass = 3)
    val c9 = new Student(name = "大强", sex = "男", Chinese = 71, Mathematics = 30, English = 80, TheClass = 3)

    val theClass1 = List(s0, s1, s2, s3, s4, s5, s6, s7, s8, s9)
    val theClass2 = List(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9)
    val theClass3 = List(c0, c1, c2, c3, c4, c5, c6, c7, c8, c9)

    val theClasses = theClass1 ::: theClass2 ::: theClass3
    //    println(theClass1)
    //    println(theClass2)
    //    println(theClass3)
    //    println(theClass1(0).TheClass)
    println("一班的语文前五是：")
    ChineseTop5(theClass1)
    println("--------------------------------")
    println("一班的数学前五是：")
    val L = MathematicsTop5(theClass1)
    println("数学第一名分数是：" + L(0))
    println("数学第二名分数是：" + L(1))
    println("数学第三名分数是：" + L(2))
    println("数学第四名分数是：" + L(3))
    println("数学第五名分数是：" + L(4))
    println("--------------------------------")
    println("一班的英语前五是：")
    EnglishTop5(theClass1)
    println("--------------------------------")
    println("一班的总分前五是：")
    TotalTop5(theClass1)
    println("--------------------------------")
    println("二班的语文前五是：")
    ChineseTop5(theClass2)
    println("--------------------------------")
    println("二班的数学前五是：")
    val N = MathematicsTop5(theClass2)
    println("数学第一名分数是：" + N(0))
    println("数学第二名分数是：" + N(1))
    println("数学第三名分数是：" + N(2))
    println("数学第四名分数是：" + N(3))
    println("数学第五名分数是：" + N(4))
    println("--------------------------------")
    println("二班的英语前五是：")
    EnglishTop5(theClass2)
    println("--------------------------------")
    println("二班的总分前五是：")
    TotalTop5(theClass2)
    println("--------------------------------")
    println("三班的语文前五是：")
    ChineseTop5(theClass3)
    println("--------------------------------")
    println("三班的数学前五是：")
    val f = MathematicsTop5(theClass3)
    println("数学第一名分数是：" + f(0))
    println("数学第二名分数是：" + f(1))
    println("数学第三名分数是：" + f(2))
    println("数学第四名分数是：" + f(3))
    println("数学第五名分数是：" + f(4))
    println("--------------------------------")
    println("三班的英语前五是：")
    EnglishTop5(theClass3)
    println("--------------------------------")
    println("三班的总分前五是：")
    TotalTop5(theClass3)
    println("--------------------------------")

    println("语文平均分:")
    ChineseAgv(theClasses)
    println("--------------------------------")
    println("数学平均分：")
    MathematicsAgv(theClasses)
    println("--------------------------------")
    println("英语平均分：")
    EnglishAgv(theClasses)
    println("--------------------------------")
    println("语文成绩人数及比例:")
    ChineseLevel(theClasses)
    println("--------------------------------")
    println("英语成绩人数及比例:")
    EnglishLevel(theClasses)
    println("--------------------------------")
    println("数学成绩人数及比例:")
    MathematicsLevel(theClasses)
    println("--------------------------------")
    println("全年级总分前20名的是:")
    TheClassTotalScoreTop20(theClasses)
    println("--------------------------------")
    ChineseTop1(theClasses)
    println("--------------------------------")
    EnglishTop1(theClasses)
    println("--------------------------------")
    MathematicsTop1(theClasses)
    //    val index = new Array[ArrayBuffer[Any]](10);
    //    for (i <- 0 until index.length){
    //      index(i) = new ArrayBuffer[Any]()
    //      }
    //    var a = 0 ;
    //    while (a<10){
    //      index(a)
    //      a = a+1
    //
    //    }
    //    index(0) += ("屠夫阿圈",1,77,94,65)//(姓名，性别，语文，数学，英语)
    //    index(1) += ("胖头鱼",1,90,100,85)
    //    index(2) += ("大雕",1,89,62,100)
    //    index(3) += ("冷冷",0,60,90,95)
    //    index(4) += ("奶子D",1,88,86,90)
    //    index(5) += ("八老板",1,87,87,88)
    //    index(6) += ("矮子龙",1,86,77,83)
    //    index(7) += ("胖头妹",0,85,68,77)
    //    index(8) += ("鸽妈",0,65,79,90)
    //    index(9) += ("斗帝",1,68,89,67)

    //    for (j <- 0 until n.length){println(j)}
  }

  def TotalTop5(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.Chinese + a.English + a.Mathematics > b.English + b.Mathematics + b.Chinese)
    println("总分第一名是：" + L(0).name + "分数是：" + (L(0).Chinese + L(0).English + L(0).Mathematics))
    println("总分第二名是：" + L(1).name + "分数是：" + (L(1).Chinese + L(1).English + L(1).Mathematics))
    println("总分第三名是：" + L(2).name + "分数是：" + (L(2).Chinese + L(2).English + L(2).Mathematics))
    println("总分第四名是：" + L(3).name + "分数是：" + (L(3).Chinese + L(3).English + L(3).Mathematics))
    println("总分第五名是：" + L(4).name + "分数是：" + (L(4).Chinese + L(4).English + L(4).Mathematics))
  }

  def ChineseTop5(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.Chinese > b.Chinese)
    println("语文第一名是：" + L(0).name + "分数是：" + L(0).Chinese)
    println("语文第二名是：" + L(1).name + "分数是：" + L(1).Chinese)
    println("语文第三名是：" + L(2).name + "分数是：" + L(2).Chinese)
    println("语文第四名是：" + L(3).name + "分数是：" + L(3).Chinese)
    println("语文第五名是：" + L(4).name + "分数是：" + L(4).Chinese)
  }


  def EnglishTop5(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.English > b.English)
    println("英语第一名是：" + L(0).name + "分数是：" + L(0).English)
    println("英语第二名是：" + L(1).name + "分数是：" + L(1).English)
    println("英语第三名是：" + L(2).name + "分数是：" + L(2).English)
    println("英语第四名是：" + L(3).name + "分数是：" + L(3).English)
    println("英语第五名是：" + L(4).name + "分数是：" + L(4).English)
  }

  def MathematicsTop5(l: List[Student]): List[Double] = {
    l.map(_.Mathematics).sortWith((a, b) => a > b)
  }

  def sum(l: List[Student], index: Int): Double = {
    l(index).English + l(index).Mathematics + l(index).Chinese
  }

  def ChineseAgv(l: List[Student]): Unit = {
    val a = l.map(_.Chinese).sum / l.length
    println(a)
  }

  def EnglishAgv(l: List[Student]): Unit = {
    val a = l.map(_.English).sum / l.length
    println(a)
  }

  def MathematicsAgv(l: List[Student]): Unit = {
    val a = l.map(_.Mathematics).sum / l.length
    println(a)
  }

  def ChineseLevel(l: List[Student]): Unit = {
    val len: Double = l.length
    val D = l.map(_.Chinese).filter(_.<(60)).length
    val C = l.map(_.Chinese).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.Chinese).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.Chinese).filter(_.>=(90)).length
    println("语文" + A + "人：优。占比：" + (A / len))
    println("语文" + B + "人：良。占比：" + (B / len))
    println("语文" + C + "人：及格。占比：" + (C / len))
    println("语文" + D + "人：不及格。占比：" + (D / len))
  }

  def EnglishLevel(l: List[Student]): Unit = {
    val len: Double = l.length
    val D = l.map(_.English).filter(_.<(60)).length
    val C = l.map(_.English).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.English).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.English).filter(_.>=(90)).length
    println("英语" + A + "人：优。占比：" + (A / len))
    println("英语" + B + "人：良。占比：" + (B / len))
    println("英语" + C + "人：及格。占比：" + (C / len))
    println("英语" + D + "人：不及格。占比：" + (D / len))
  }

  def MathematicsLevel(l: List[Student]): Unit = {
    val len: Double = l.length
    val D = l.map(_.Mathematics).filter(_.<(60)).length
    val C = l.map(_.Mathematics).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.Mathematics).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.Mathematics).filter(_.>=(90)).length
    println("数学" + A + "人：优。占比：" + (A / len))
    println("数学" + B + "人：良。占比：" + (B / len))
    println("数学" + C + "人：及格。占比：" + (C / len))
    println("数学" + D + "人：不及格。占比：" + (D / len))
  }

  def TheClassTotalScoreTop20(l: List[Student]): Unit = {
    val L = l.sortWith((a: Student, b: Student) => a.Chinese + a.Mathematics + a.English > b.Chinese + b.Mathematics + b.English)
    for (i <- 0 to 19) {
      println(L(i).name + "是年级总分第" + (i + 1) + "名,分数是：" + sum(L, i))
    }
  }

  def ChineseTop1(l: List[Student]): Unit = {
    val m = l.filter(_.sex == "男")
    val w = l.filter(_.sex == "女")
    val M = m.sortWith((a: Student, b: Student) => a.Chinese > b.Chinese).head
    val W = w.sortWith((a: Student, b: Student) => a.Chinese > b.Chinese).head
    println("全年级语文男状元是：" + M.name + "分数为:" + M.Chinese)
    println("全年级语文女状元是：" + W.name + "分数为:" + W.Chinese)
  }

  def EnglishTop1(l: List[Student]): Unit = {
    val m = l.filter(_.sex == "男")
    val w = l.filter(_.sex == "女")
    val M = m.sortWith((a: Student, b: Student) => a.English > b.English).head
    val W = w.sortWith((a: Student, b: Student) => a.English > b.English).head
    println("全年级语文男状元是：" + M.name + "分数为:" + M.English)
    println("全年级语文女状元是：" + W.name + "分数为:" + W.English)
  }

  def MathematicsTop1(l: List[Student]): Unit = {
    val m = l.filter(_.sex == "男")
    val w = l.filter(_.sex == "女")
    val M = m.sortWith((a: Student, b: Student) => a.Mathematics > b.Mathematics).head
    val W = w.sortWith((a: Student, b: Student) => a.Mathematics > b.Mathematics).head
    println("全年级语文男状元是：" + M.name + "分数为:" + M.Mathematics)
    println("全年级语文女状元是：" + W.name + "分数为:" + W.Mathematics)
  }

}
