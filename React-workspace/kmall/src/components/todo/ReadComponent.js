import React, { useEffect, useState } from "react"
import { getOne } from "../../api/todoApi"

const initState = {
    tno:0,
    title:'',
    writer:'',
    dueDate:'',
    complete:false
}

function ReadComponent({tno}) {
    const [todo, setTodo] = useState(initState)
    useEffect(() => {

        getOne(tno).then(data => {
            console.log(data)
            setTodo(data)
        })

    }, [])

    return (
        <div>
            Todo Read Page Component {tno}
        </div>
    )
}

export default ReadComponent