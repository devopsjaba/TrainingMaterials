import { lazy, Suspense } from "react";
import { Navigate } from "react-router-dom"

const Loading = <div className={'bg-red-700'}>Loading...</div>

const TodoList = lazy(() => import("../pages/todo/ListPage"))
const TodoRead = lazy(() => import("../pages/todo/ReadPage"))

const todoRouter = () => {
    return [
        {
            path: 'list',
            element: <Suspense fallback={Loading}><TodoList/></Suspense>
        },
        {
            path: '',
            element: <Navigate replace to={'list'} />
        },
        {
            path: 'read/:tno',
            element: <Suspense fallback={Loading}><TodoRead /></Suspense>
        }
    ]
}

export default todoRouter