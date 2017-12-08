package until
import student.Student
class unit{
  def TotalTop5(l:List[Student]):Unit={
    val L = l.sortWith((a:Student,b:Student) => a.Chinese+a.English+a.Mathematics>b.English+b.Mathematics+b.Chinese)
    println("总分第一名是："+L(0).name+"分数是："+(L(0).Chinese+L(0).English+L(0).Mathematics))
    println("总分第二名是："+L(1).name+"分数是："+(L(1).Chinese+L(1).English+L(1).Mathematics))
    println("总分第三名是："+L(2).name+"分数是："+(L(2).Chinese+L(2).English+L(2).Mathematics))
    println("总分第四名是："+L(3).name+"分数是："+(L(3).Chinese+L(3).English+L(3).Mathematics))
    println("总分第五名是："+L(4).name+"分数是："+(L(4).Chinese+L(4).English+L(4).Mathematics))
  }
  def ChineseTop5(l:List[Student]):Unit={
    val L = l.sortWith((a:Student,b:Student) => a.Chinese>b.Chinese)
    println("语文第一名是："+L(0).name+"分数是："+L(0).Chinese)
    println("语文第二名是："+L(1).name+"分数是："+L(1).Chinese)
    println("语文第三名是："+L(2).name+"分数是："+L(2).Chinese)
    println("语文第四名是："+L(3).name+"分数是："+L(3).Chinese)
    println("语文第五名是："+L(4).name+"分数是："+L(4).Chinese)
  }


  def EnglishTop5(l:List[Student]):Unit={
    val L = l.sortWith((a:Student,b:Student) => a.English>b.English)
    println("英语第一名是："+L(0).name+"分数是："+L(0).English)
    println("英语第二名是："+L(1).name+"分数是："+L(1).English)
    println("英语第三名是："+L(2).name+"分数是："+L(2).English)
    println("英语第四名是："+L(3).name+"分数是："+L(3).English)
    println("英语第五名是："+L(4).name+"分数是："+L(4).English)
  }
  def MathematicsTop5(l:List[Student]):List[Double]={
    l.map(_.Mathematics).sortWith((a,b) => a>b)
  }

  def sum(l:List[Student],index:Int): Double={
    l(index).English+l(index).Mathematics+l(index).Chinese
  }

  def ChineseAgv(l:List[Student]):Unit={
    val a = l.map(_.Chinese).sum/l.length
    println(a)
  }
  def EnglishAgv(l:List[Student]):Unit={
    val a = l.map(_.English).sum/l.length
    println(a)
  }
  def MathematicsAgv(l:List[Student]):Unit={
    val a = l.map(_.Mathematics).sum/l.length
    println(a)
  }
  def ChineseLevel(l:List[Student]):Unit={
    val len : Double = l.length
    val D = l.map(_.Chinese).filter(_.<(60)).length
    val C = l.map(_.Chinese).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.Chinese).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.Chinese).filter(_.>=(90)).length
    println("语文"+A+"人：优。占比："+(A/len))
    println("语文"+B+"人：良。占比："+(B/len))
    println("语文"+C+"人：及格。占比："+(C/len))
    println("语文"+D+"人：不及格。占比："+(D/len))
  }
  def EnglishLevel(l:List[Student]):Unit={
    val len : Double = l.length
    val D = l.map(_.English).filter(_.<(60)).length
    val C = l.map(_.English).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.English).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.English).filter(_.>=(90)).length
    println("英语"+A+"人：优。占比："+(A/len))
    println("英语"+B+"人：良。占比："+(B/len))
    println("英语"+C+"人：及格。占比："+(C/len))
    println("英语"+D+"人：不及格。占比："+(D/len))
  }
  def MathematicsLevel(l:List[Student]):Unit={
    val len : Double = l.length
    val D = l.map(_.Mathematics).filter(_.<(60)).length
    val C = l.map(_.Mathematics).filter(_.<(75)).filter(_.>=(60)).length
    val B = l.map(_.Mathematics).filter(_.<(90)).filter(_.>=(75)).length
    val A = l.map(_.Mathematics).filter(_.>=(90)).length
    println("数学"+A+"人：优。占比："+(A/len))
    println("数学"+B+"人：良。占比："+(B/len))
    println("数学"+C+"人：及格。占比："+(C/len))
    println("数学"+D+"人：不及格。占比："+(D/len))
  }
  def TheClassTotalScoreTop20(l:List[Student]):Unit={
    val L = l.sortWith((a:Student,b:Student) => a.Chinese+a.Mathematics+a.English>b.Chinese+b.Mathematics+b.English)
    for (i <- 0 to 19){
      println(L(i).name+"是年级总分第"+(i+1)+"名,分数是："+sum(L,i))
    }
  }
  def ChineseTop1(l:List[Student]):Unit={
    val m = l.filter(_.sex=="男")
    val w = l.filter(_.sex=="女")
    val M = m.sortWith((a:Student,b:Student) => a.Chinese>b.Chinese).head
    val W = w.sortWith((a:Student,b:Student) => a.Chinese>b.Chinese).head
    println("全年级语文男状元是："+M.name+"分数为:"+M.Chinese)
    println("全年级语文女状元是："+W.name+"分数为:"+W.Chinese)
  }
  def EnglishTop1(l:List[Student]):Unit={
    val m = l.filter(_.sex=="男")
    val w = l.filter(_.sex=="女")
    val M = m.sortWith((a:Student,b:Student) => a.English>b.English).head
    val W = w.sortWith((a:Student,b:Student) => a.English>b.English).head
    println("全年级语文男状元是："+M.name+"分数为:"+M.English)
    println("全年级语文女状元是："+W.name+"分数为:"+W.English)
  }
  def MathematicsTop1(l:List[Student]):Unit={
    val m = l.filter(_.sex=="男")
    val w = l.filter(_.sex=="女")
    val M = m.sortWith((a:Student,b:Student) => a.Mathematics>b.Mathematics).head
    val W = w.sortWith((a:Student,b:Student) => a.Mathematics>b.Mathematics).head
    println("全年级语文男状元是："+M.name+"分数为:"+M.Mathematics)
    println("全年级语文女状元是："+W.name+"分数为:"+W.Mathematics)
  }
}
