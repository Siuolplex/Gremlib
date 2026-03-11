plugins {
    id("gremdle-loader")
    id("net.fabricmc.fabric-loom")
}

val minecraft_version : String by project

val mod_id: String by project
val version: String by project
val mod_name: String by project

//val parchment_minecraft_version : String by project
//val parchment_version : String by project

val fabric_loader_version : String by project
val fabric_api_version : String by project

dependencies {
    minecraft("com.mojang:minecraft:${minecraft_version}")
    //mappings(loom.officialMojangMappings())
    /*mappings (
            loom.layered {
                officialMojangMappings()
                parchment("org.parchmentmc.data:parchment-${parchment_minecraft_version}:${parchment_version}@zip")
            }
    )*/
    implementation ("net.fabricmc:fabric-loader:${fabric_loader_version}")
    implementation ("net.fabricmc.fabric-api:fabric-api:${fabric_api_version}")
}

loom {
    var aw = project(":common").file("src/main/resources/${mod_id}.accesswidener")

    if (aw.exists()) {
        accessWidenerPath.set(aw)
    }

    runs {
        this.getByName("client") {
            client()
            setConfigName("Fabric Client")
            ideConfigGenerated(true)
            runDir("run/client")
        }

        this.getByName("server") {
            server()
            setConfigName("Fabric Server")
            ideConfigGenerated(true)
            runDir("run/server")
        }
    }
}

fabricApi {
    configureDataGeneration() {
        client = true
    }
}
