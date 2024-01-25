package com.luiz.veiculo

fun main(){
    var veiculo = Car("Uno")
    veiculo.writeScreen()
    veiculo.Speed(10)
    veiculo.NewVelocitySpeed()
    veiculo.writeScreen()
    veiculo.Slow(20)
    veiculo.NewVelocitySlow()
    veiculo.writeScreen()
    veiculo.Speed(10)
    veiculo.NewVelocitySpeed()
    veiculo.writeScreen()
    veiculo.Slow(40)
    veiculo.NewVelocitySlow()
    veiculo.writeScreen()
}

class Car(model: String){
    var velocity: Long
    var acceleration: Long
    var model: String

    init{
        this.velocity = 0
        this.acceleration = 10
        this.model = model
    }

    fun writeScreen(){
        println("Velocidade: $velocity, Aceleração: $acceleration, Modelo: $model")
    }

    fun Speed(move: Long){
        acceleration = acceleration + move
    }
    fun Slow(move: Long){
        acceleration = acceleration - move

        if (acceleration < 0){
            acceleration = 0
        }
    }

    fun NewVelocitySpeed(){
        velocity = velocity + acceleration
    }

    fun NewVelocitySlow(){
        velocity = acceleration

        if (velocity < 0){
            velocity = 0
        }
    }
}