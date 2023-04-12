package com.tracer.wallet_tracer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WalletTracerApplication

fun main(args: Array<String>) {
	runApplication<WalletTracerApplication>(*args)
}
