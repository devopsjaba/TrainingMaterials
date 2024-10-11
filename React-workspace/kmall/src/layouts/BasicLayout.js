import React, { Children } from "react"
import BasicMenu from "../components/BasicMenu"

const BasicLayout = ({children}) => {

    return (
        <>
            <header className="bg-teal-400 p-5">
                <BasicMenu />
            </header>
            <div className="bg-white my-5 w-full flex flex-col space-y-4 md:flex-row md:space-x-4 md:space-y-4">
                <main className="bg-sky-300 md:w-2/3 lg:w-3/4 px-5 py-40">
                    {children}
                </main>
                <aside className="bg-gray-100 md:w-1/3 px-5 py-40">
                    <h1 className="text-2xl md:text-4xl">Sidebar</h1>
                </aside>
            </div>
        </>    
    )

}

export default BasicLayout