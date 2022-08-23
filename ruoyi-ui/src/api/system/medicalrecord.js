import request from '@/utils/request'

// 查询门诊病历列表
export function listMedicalrecord(query) {
  return request({
    url: '/system/medicalrecord/list',
    method: 'get',
    params: query
  })
}

// 查询门诊病历详细
export function getMedicalrecord(id) {
  return request({
    url: '/system/medicalrecord/' + id,
    method: 'get'
  })
}

// 新增门诊病历
export function addMedicalrecord(data) {
  return request({
    url: '/system/medicalrecord',
    method: 'post',
    data: data
  })
}

// 修改门诊病历
export function updateMedicalrecord(data) {
  return request({
    url: '/system/medicalrecord',
    method: 'put',
    data: data
  })
}

// 删除门诊病历
export function delMedicalrecord(id) {
  return request({
    url: '/system/medicalrecord/' + id,
    method: 'delete'
  })
}
