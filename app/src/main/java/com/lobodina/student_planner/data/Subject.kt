package com.lobodina.student_planner.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)
val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
    ),
    Subject(
        id = "3",
        name = "Иностранный язык в профессиональной деятельность",
        professor = "Пенькова О.В",
        credits = 88,
        currentGrade = "Хорощо",
        description = "Изучение английского языка в проф деятельности."
    ),
    Subject(
        id = "4",
        name = "Математическое моделирование",
        professor = "Трошина.О.В",
        credits = 67,
        currentGrade = "Удовлетворительно",
        description = "Разработка мат.моделей."
    ),
    Subject(
        id = "5",
        name = "Управление проектами",
        professor = "Трошина О.В",
        credits = 79,
        currentGrade = "Хорошо",
        description = "Планирование проектов в Microsoft Project ."
    ) ,
    Subject(
        id = "6",
        name = "Обеспечение качества функционирования компьютерных систем",
        professor = "Ушакова М.М",
        credits = 79,
        currentGrade = "Хорошо",
        description = "Рассматривание видов стандартизации, их особенности"
)
)