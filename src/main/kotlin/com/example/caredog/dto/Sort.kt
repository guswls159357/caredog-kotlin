package com.example.caredog.dto

abstract class Sort{

    enum class Field(){
        ID,
        TITLE,
        CREATEDAt,
        VIEW,
        LIKE;

        companion object{

            @JvmStatic
            fun of(field: String?): Field {

                return when{
                    field.equals(ID.name, true) -> ID
                    field.equals(TITLE.name, true) -> TITLE
                    field.equals(LIKE.name, true) -> LIKE
                    field.equals(VIEW.name, true) -> VIEW
                    else -> CREATEDAt
                }
            }
        }
    }

    enum class Direction{
        ASC, DESC;

        companion object{

            @JvmStatic
            fun of(directionStr: String?): Direction {

                return when{
                    directionStr.equals(Direction.ASC.name, true) -> ASC
                    else -> DESC
                }
            }
        }
    }
}