package by.reactive.sample.performance

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object Engine extends App {

	val props = new GatlingPropertiesBuilder
	props.dataDirectory(IDEPathHelper.dataDirectory.toString())
	props.resultsDirectory(IDEPathHelper.resultsDirectory.toString())
	props.binariesDirectory(IDEPathHelper.mavenBinariesDirectory.toString())
    props.simulationClass(classOf[TestScenario].getName)

	Gatling.fromMap(props.build)
}
