plugins {
    id("java")
    id("me.champeau.jmh") version "0.7.2"
}

group = "com.otus.java.advanced"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    jmh("com.google.guava:guava:33.0.0-jre")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

jmh {
    excludes.addAll("*")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicDefault")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicShort")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicNoFork")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicTracing")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicRecursive*")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicSpeedUp*")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicCnt")
//    includes.addAll("com.otus.java.advanced.FibonacciBenchmarks.fibClassicModeAll")

//    includes.addAll("com.otus.java.advanced.DeadCodeElimination")

//    includes.addAll("com.otus.java.advanced.ConstantFolding")

//    includes.addAll("com.otus.java.advanced.map.ConcurrentHashMapEx.benchmarkConcurrentHashMapGet")
//    includes.addAll("com.otus.java.advanced.map.ConcurrentHashMapEx.benchmarkConcurrentHashMapPut")
//    includes.addAll("com.otus.java.advanced.map.HashTableEx.benchmarkHashtablePut")
//    includes.addAll("com.otus.java.advanced.map.ConcurrentSkipListMapEx.benchmarkConcurrentSkipListMapPut")

//    includes.addAll("com.otus.java.advanced.counters.Experiment_1_NoThreadSafeCounter")
//    includes.addAll("com.otus.java.advanced.counters.Experiment_2_VolatileNoThreadSafeCounter")
//    includes.addAll("com.otus.java.advanced.counters.Experiment_3_SynchronizedCounter")
//    includes.addAll("com.otus.java.advanced.counters.Experiment_4_LockedCounter")
//    includes.addAll("com.otus.java.advanced.counters.Experiment_5_ReadWriteLockedCounter")
//    includes.addAll("com.otus.java.advanced.counters.Experiment_6_AtomicCounter")
    includes.addAll("com.otus.java.advanced.counters.*")

//    includes.addAll("com.otus.java.advanced.maps.Experiment_1_HashMapShared")
//    includes.addAll("com.otus.java.advanced.maps.Experiment_2_SynchronizedHashMapShared")
//    includes.addAll("com.otus.java.advanced.maps.Experiment_3_LockedHashMapShared")
//    includes.addAll("com.otus.java.advanced.maps.Experiment_4_ReadWriteLockedHashMapShared")
//    includes.addAll("com.otus.java.advanced.maps.Experiment_5_ConcurrentHashMapShared")
//    includes.addAll("com.otus.java.advanced.maps.*")
}
