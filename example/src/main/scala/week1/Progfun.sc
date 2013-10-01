/**
 * Created with IntelliJ IDEA.
 * User: suresh
 * Date: 9/23/13
 * Time: 9:35 PM
 */

def loop : Int = loop




def constOne(x:Int, y: => Int) = 1
constOne(1+2,loop)
constOne(3,loop)
// Infinite loop
//constOne(loop,1+5)


def abs(x:Int) = if (x>=0) x else -x
abs(5)
abs(-5)


def loop1 : Boolean  = loop1

def x = loop1
// Infinite loop
//val x1 = loop1


def add(x:Boolean, y: => Boolean)  = if(x)  y else false
def or(x: Boolean, y: =>Boolean) = if(x) true else y


