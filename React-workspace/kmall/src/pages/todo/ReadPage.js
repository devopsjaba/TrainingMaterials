import React from "react"
import { useParams } from "react-router-dom"

function ReadPage(props) {

    const {tno} = useParams();
    console.log(tno)            // { tno : "33" }

    return (
        <div className="text-3xl">
            Todo Read Page Component
        </div>
    )
}

export default ReadPage

