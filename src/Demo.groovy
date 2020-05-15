// playing around a bit stuff taken from here : https://www.guru99.com/groovy-tutorial.html + other sources

def x = 104
println x.getClass()
x = "Guru99"
println x.getClass()


def y = """Groovy
at
Guru99"""
println y

try{
int z = 104
println x
z = "Guru99"}
catch(Exception e){
    e.printStackTrace()
}

0.upto(4) {println "$it"}
5.times{println "$it"}


def l = ["Guru99", "is", "Best", "for", "Groovy"]  //lists
println l
l.add("Learning")
println(l.contains("is"))
println(l.get(2))
println(l.pop())


//maps

def m = [fName:'Jen', lName:'Cruise', sex:'F']
print m.get("fName")

//closures /higher order functions , https://dzone.com/articles/higher-order-functions-groovy-


def myClosure = {
    println "My First Closure"
}
myClosure()


def my2ndClosure = {
    a,b,c->
        return (a+b+c)
}
println(my2ndClosure(1,2,3))
my2ndClosure.call(1,2,3)



List stuff = [1,3,3,33,4,5,4,55,4,45,4]
def cl = {
    max, it ->
        it  > max ? it : max
}

def maxRating = stuff.inject(0,{
    max, it ->
        it  > max ? it : max
})
maxRating = stuff.inject(){
    max, it ->
        it  > max ? it : max
}
maxRating = stuff.inject(0,cl)

println maxRating


println cl(2,9)


System.properties.each { println it }


// call closure recursively : Sergey Bondarenko created this one:
def fac = { int i -> i == 1 ? 1 : i * call(i - 1) }
println fac(10)

















