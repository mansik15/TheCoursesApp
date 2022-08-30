package com.app.coursesapp

class Datasource {
    fun loadTopics(): List<Topic> {
        return listOf<Topic>(
            Topic(R.string.architecture, 58, R.drawable.ic_launcher_background),
            Topic(R.string.crafts, 121, R.drawable.ic_launcher_background),
            Topic(R.string.business, 78, R.drawable.ic_launcher_background),
            Topic(R.string.culinary, 118, R.drawable.ic_launcher_background),
            Topic(R.string.design, 423, R.drawable.ic_launcher_background),
            Topic(R.string.fashion, 92, R.drawable.ic_launcher_background),
            Topic(R.string.film, 165, R.drawable.ic_launcher_background),
            Topic(R.string.gaming, 164, R.drawable.ic_launcher_background),
            Topic(R.string.drawing, 326, R.drawable.ic_launcher_background),
            Topic(R.string.lifestyle, 305, R.drawable.ic_launcher_background),
            Topic(R.string.music, 212, R.drawable.ic_launcher_background),
            Topic(R.string.painting, 172, R.drawable.ic_launcher_background),
            Topic(R.string.photography, 321, R.drawable.ic_launcher_background),
            Topic(R.string.tech, 118, R.drawable.ic_launcher_background)
        )
    }

}