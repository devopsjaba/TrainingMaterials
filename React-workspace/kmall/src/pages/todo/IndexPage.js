import React from "react"
import BasicLayout from "../../layouts/BasicLayout"
import { Outlet, useNavigate } from "react-router-dom"

function IndexPage(props) {

    const navigate = useNavigate();

    const handleCliskList = () => {
        navigate({ pathname: "list" })
    }

    const handleCliskAdd = () => {
        navigate({ pathname: "add" })
    }    

    return (
        <BasicLayout>
            <div className="w-full flex m-2 p-2">
                <div className="text-xl m-1 w-20 font-extrabold text-center underline"
                    onClick={handleCliskList}>LIST</div>
                <div className="text-xl m-1 w-20 font-extrabold text-center underline"
                    onClick={handleCliskAdd}>ADD</div>
            </div>              
            <div className="flex flex-wrap w-full">
                <Outlet />
            </div>  
        </BasicLayout>
    )
}

export default IndexPage
