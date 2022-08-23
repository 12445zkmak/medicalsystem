import request from '@/utils/request'

// 查询医生看病结果列表
export function listResult(query) {
  return request({
    url: '/system/result/list',
    method: 'get',
    params: query
  })
}

// 查询医生看病结果详细
export function getResult(opdoctorresultid) {
  return request({
    url: '/system/result/' + opdoctorresultid,
    method: 'get'
  })
}

// 新增医生看病结果
export function addResult(data) {
  return request({
    url: '/system/result',
    method: 'post',
    data: data
  })
}

// 修改医生看病结果
export function updateResult(data) {
  return request({
    url: '/system/result',
    method: 'put',
    data: data
  })
}

// 删除医生看病结果
export function delResult(opdoctorresultid) {
  return request({
    url: '/system/result/' + opdoctorresultid,
    method: 'delete'
  })
}
