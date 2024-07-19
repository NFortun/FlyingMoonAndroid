package com.example.flyingmoon.services

import io.grpc.Channel
import io.grpc.ManagedChannel
import kotlinx.coroutines.flow.FlowCollector
import polar_align.PolarAlignGrpcKt
import polar_align.PolarAlignOuterClass
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Intrinsics

class PolarAlignService(channel: Channel) {
    private val polarAlignStub: PolarAlignGrpcKt.PolarAlignCoroutineStub = PolarAlignGrpcKt.PolarAlignCoroutineStub(channel)

    fun StartPolarAlign(continuation: Continuation<Unit>?) {
        val request: PolarAlignOuterClass.Request =
            PolarAlignOuterClass.Request.newBuilder().build()
        val polarAlignCoroutineStub: PolarAlignGrpcKt.PolarAlignCoroutineStub = this.polarAlignStub
    }
}